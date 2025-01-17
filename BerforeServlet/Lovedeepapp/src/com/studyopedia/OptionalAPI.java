package com.studyopedia;
import java.util.*;
import java.util.function.*;
public class OptionalAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Optional<String> empty = Optional.empty();
		System.out.println(empty.isPresent());
		
		Optional<String> opt =Optional.of("Nitin");
		opt.ifPresent(str->System.out.println(str.length()));
	}

}
