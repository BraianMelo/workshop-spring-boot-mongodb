package com.braian.workshopmongo.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String text;
	private Date date;
	private AuthorDTO authorDTO;
	
	private List<CommentDTO> comments = new ArrayList<>();
	
	public CommentDTO() {}

	public CommentDTO(String text, Date date, AuthorDTO authorDTO) {
		super();
		this.text = text;
		this.date = date;
		this.authorDTO = authorDTO;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public AuthorDTO getAuthorDTO() {
		return authorDTO;
	}
	
	public List<CommentDTO> getComments() {
		return comments;
	}

	public void setComments(List<CommentDTO> comments) {
		this.comments = comments;
	}

	public void setAuthorDTO(AuthorDTO authorDTO) {
		this.authorDTO = authorDTO;
	}
}
