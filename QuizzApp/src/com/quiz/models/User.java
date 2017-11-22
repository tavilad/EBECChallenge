package com.quiz.models;

public class User {

	int idUser;
	String nume;
	String password;

	public User(int idUser, String nume, String password) {
		this.idUser = idUser;
		this.nume = nume;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", nume=" + nume + ", password=" + password + "]";
	}

}
