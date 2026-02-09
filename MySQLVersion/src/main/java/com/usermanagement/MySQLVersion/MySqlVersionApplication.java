package com.usermanagement.MySQLVersion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * Application principale pour la gestion des utilisateurs dans la base de données MySQL
 * @author Christian Regis
 */
@SpringBootApplication
public class MySqlVersionApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySqlVersionApplication.class, args);
	}

	/**
	 * Constructeur par défaut pour l'application MySqlVersionApplication
	 */
	public MySqlVersionApplication() {
	}

}
