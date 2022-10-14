package kodlamaIO.core.logger;

import java.util.Date;

public class FileLogger implements Logger {

	public void log(String message, int id) {
		// TODO Auto-generated method stub
		System.out.println(new Date().toString()+" --- "+ id+ " ID li kayıt --- "+message+" işlemi");
	}
}
