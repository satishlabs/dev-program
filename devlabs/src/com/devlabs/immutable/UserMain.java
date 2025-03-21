package com.devlabs.immutable;

import java.util.Arrays;
import java.util.List;

public class UserMain {
	public static void main(String[] args) {
		List<String> roles = Arrays.asList("ADMIN","USER");
		
		User user = new User("Satish", "satish@gmail.com", roles);
		
		System.out.println(user);
		
        //Trying to modify the list externally (will not affect the original object)
		//roles.add("SUPERADMIN");// This will throw an UnsupportedOperationException
		//System.out.println(user.getRoles());// Still remains unchanged
	}
}
