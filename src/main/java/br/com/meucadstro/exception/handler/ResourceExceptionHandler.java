package br.com.meucadstro.exception.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.meucadastro.exception.handler.validation.StandardError;
import br.com.meucadastro.exception.handler.validation.ValidationError;
import br.com.meucadastro.exception.model.CpfDuplicadoException;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<StandardError> validation(MethodArgumentNotValidException e,
			                                                            HttpServletRequest request){
	
	   var erro = new ValidationError();
		
	   for(FieldError x : e.getBindingResult().getFieldErrors()) {
		   erro.addError(x.getField(), x.getDefaultMessage());
	   }
			
	    erro.setTimestamp(System.currentTimeMillis());
		erro.setStatus(400);
		erro.setError("Erro de Validação");
		erro.setMessage(e.getMessage());
		erro.setPath(request.getRequestURI());
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erro);
	}
	
	@ExceptionHandler(CpfDuplicadoException.class)
	public ResponseEntity<StandardError> objectNotFoundException(CpfDuplicadoException e,
			                                                            HttpServletRequest request){
		var erro = new StandardError();
		
		erro.setTimestamp(System.currentTimeMillis());
		erro.setStatus(409);
		erro.setError("CPF duplicado");
		erro.setMessage(e.getMessage());
		erro.setPath(request.getRequestURI());
		
		return ResponseEntity.status(HttpStatus.CONFLICT).body(erro);
	}
	
	
	
}
