package domaine.security;

import java.util.UUID;

 

public class Token {
private static String uniqueID ;
	
	public static String generate()
	{
		setUniqueID(UUID.randomUUID().toString());
		return uniqueID ;
	}
	
	public String getUniqueID() {
		return uniqueID;
	}

	public static void setUniqueID(String uniqueID) {
		Token.uniqueID = uniqueID;
	}

}
