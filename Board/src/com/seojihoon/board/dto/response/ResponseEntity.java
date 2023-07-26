package com.seojihoon.board.dto.response;

public class ResponseEntity<D> {
	private int status;
	private String message;
	private D data;
	
	public ResponseEntity(int status, String message, D data) {
		this.status = status;
		this.message = message;
		this.data = data;
	}

	@Override
	public String toString() {
		return "[status=" + status + ", message=" + message + ", data=" + data + "]";
	}
	
}
