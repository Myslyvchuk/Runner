package com.myslyv4uk.hackerrank;

import java.io.*;
import java.security.Permission;
import java.text.NumberFormat;
import java.time.DayOfWeek;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Challenges {
	private Challenges(){}
	static class WelcomeToJava {
		//https://www.hackerrank.com/challenges/welcome-to-java/problem
		public static void main(String[] args) {
			System.out.println("Hello, World.");
			System.out.println("Hello, Java.");
		}
	}
	
	static class StdinAndStdoutI {
		//https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			while (scan.hasNext()) {
				int a = scan.nextInt();
				System.out.println(a);
			}
		}
	}
	
	static class IfElse {
		//https://www.hackerrank.com/challenges/java-if-else/problem
		private static final Scanner scanner = new Scanner(System.in);
		
		public static void main(String[] args) {
			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			if (n % 2 != 0) {
				System.out.println("Weird");
			} else if (n % 2 == 0 && (n >= 2 && n <= 5)) {
				System.out.println("Not Weird");
			} else if (n % 2 == 0 && (n >= 6 && n <= 20)) {
				System.out.println("Weird");
			} else if (n % 2 == 0 && n > 20) {
				System.out.println("Not Weird");
			}
			scanner.close();
		}
	}
	
	static class StdinAndStdoutII {
		//https://www.hackerrank.com/challenges/java-stdin-stdout/problem
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			int i = scan.nextInt();
			double d = scan.nextDouble();
			scan.nextLine();
			String s = scan.nextLine();
			
			System.out.println("String: " + s);
			System.out.println("Double: " + d);
			System.out.println("Int: " + i);
		}
	}
	
	static class OutputFormatting {
		//https://www.hackerrank.com/challenges/java-output-formatting/problem
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("================================");
			for (int i = 0; i < 3; i++) {
				String s1 = sc.next();
				int x = sc.nextInt();
				System.out.printf("%-14s %03d%n", s1, x);
				
			}
			System.out.println("================================");
		}
	}
	
	static class LoopI {
		//https://www.hackerrank.com/challenges/java-loops-i/problem
		public static void main(String[] args) throws IOException {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			
			int N = Integer.parseInt(bufferedReader.readLine().trim());
			for (int i = 1; i <= 10; i++) {
				System.out.printf("%d x %d = %d%n", N, i, i * N);
			}
			bufferedReader.close();
		}
	}
	
	static class LoopII {
		//https://www.hackerrank.com/challenges/java-loops/problem
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int t = in.nextInt();
			for (int i = 0; i < t; i++) {
				int a = in.nextInt();
				int b = in.nextInt();
				int n = in.nextInt();
				int c = a;
				for (int j = 0; j < n; j++) {
					c += Math.pow(2, j) * b;
					System.out.printf("%d ", c);
				}
				System.out.println();
			}
			in.close();
		}
	}
	
	static class DataTypes {
		//https://www.hackerrank.com/challenges/java-datatypes/problem
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			for (int i = 0; i < t; i++) {
				try {
					long x = sc.nextLong();
					System.out.println(x + " can be fitted in:");
					if (x >= -128 && x <= 127) System.out.println("* byte");
					if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) System.out.println("* short");
					if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) System.out.println("* int");
					if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) System.out.println("* long");
					else throw new Exception("");
				} catch (Exception e) {
					System.out.println(sc.next() + " can't be fitted anywhere.");
				}
			}
		}
	}
	
	static class EndOfFile {
		//https://www.hackerrank.com/challenges/java-end-of-file/problem
		public static void main(String[] args) {
			/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
			Scanner sc = new Scanner(System.in);
			int count = 0;
			while (sc.hasNext()) {
				String next = sc.nextLine();
				System.out.printf("%d %s %n", ++count, next);
			}
		}
	}
	
	static class StaticInitializer {
		//https://www.hackerrank.com/challenges/java-static-initializer-block/problem
		private static int B;
		private static int H;
		private static boolean flag;
		
		static {
			Scanner sc = new Scanner(System.in);
			B = sc.nextInt();
			H = sc.nextInt();
			if (B > 0 && H > 0) {
				flag = true;
			} else {
				flag = false;
				try {
					throw new Exception("Breadth and height must be positive");
				} catch (Exception e) {
					System.out.println(e);
				}
				
			}
		}
		public static void main(String[] args) {
			if (flag) {
				int area = B * H;
				System.out.print(area);
			}
		}
	}
	
	static class IntToString {
		//https://www.hackerrank.com/challenges/java-int-to-string/problem
		public static void main(String[] args) {
			
			DoNotTerminate.forbidExit();
			
			try {
				Scanner in = new Scanner(System.in);
				int n = in.nextInt();
				in.close();
				
				String s = new String().valueOf(n);
				
				
				if (n == Integer.parseInt(s)) {
					System.out.println("Good job");
				} else {
					System.out.println("Wrong answer.");
				}
			} catch (DoNotTerminate.ExitTrappedException e) {
				System.out.println("Unsuccessful Termination!!");
			}
		}
		
		class DoNotTerminate {
			
			public static class ExitTrappedException extends SecurityException {
				
				private static final long serialVersionUID = 1;
			}
			
			public static void forbidExit() {
				final SecurityManager securityManager = new SecurityManager() {
					@Override
					public void checkPermission(Permission permission) {
						if (permission.getName().contains("exitVM")) {
							throw new ExitTrappedException();
						}
					}
				};
				System.setSecurityManager(securityManager);
			}
		}
	}
	
	static class DateAndTime {
		//https://www.hackerrank.com/challenges/java-date-and-time/problem
		public static void main(String[] args) throws IOException {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
			
			String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
			
			int month = Integer.parseInt(firstMultipleInput[0]);
			
			int day = Integer.parseInt(firstMultipleInput[1]);
			
			int year = Integer.parseInt(firstMultipleInput[2]);
			
			String res = Result.findDay(month, day, year);
			
			bufferedWriter.write(res);
			bufferedWriter.newLine();
			
			bufferedReader.close();
			bufferedWriter.close();
		}
		
		class Result {
			public static String findDay(int month, int day, int year) {
				Calendar c = new GregorianCalendar(year, month - 1, day - 1);
				return DayOfWeek.of(c.get(Calendar.DAY_OF_WEEK)).name();
			}
			
		}
		
	}
	
	static class CurrencyFormatter {
		//https://www.hackerrank.com/challenges/java-currency-formatter/problem
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			double payment = scanner.nextDouble();
			scanner.close();
			
			String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
			String india = NumberFormat.getCurrencyInstance(Locale.US).format(payment).replace("$", "Rs.");
			String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
			String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
			
			System.out.println("US: " + us);
			System.out.println("India: " + india);
			System.out.println("China: " + china);
			System.out.println("France: " + france);
		}
	}
	
	static class StringsIntroduction {
		//https://www.hackerrank.com/challenges/java-strings-introduction/problem
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			String A = sc.next();
			String B = sc.next();
			System.out.println(A.length() + B.length());
			System.out.println(A.charAt(0) > B.charAt(0) ? "Yes" : "No");
			System.out.printf("%s %s", A.replace(A.charAt(0), Character.toUpperCase(A.charAt(0))), B.replace(B.charAt(0), Character.toUpperCase(B.charAt(0))));
		}
	}
	
	static class JavaPriorityQueue {
		//https://www.hackerrank.com/challenges/java-priority-queue/problem
		static class Student implements Comparable<Student> {
			
			private int id;
			private String name;
			private double cgpa;
			
			public Student(String name, double cgpa, int id) {
				super();
				this.id = id;
				this.name = name;
				this.cgpa = cgpa;
			}
			
			public int getId() {
				return id;
			}
			
			public String getName() {
				return name;
			}
			
			public double getCgpa() {
				return cgpa;
			}
			
			@Override
			public int compareTo(Student o) {
				int compare = Double.compare(o.getCgpa(), this.getCgpa());
				if (compare == 0) {
					compare = Character.compare(this.getName().charAt(0), o.getName().charAt(0));
					if (compare == 0) {
						compare = Integer.compare(o.getId(), this.getId());
					}
				}
				return compare;
			}
		}
		
		static class Priorities {
			public List<Student> getStudents(List<String> events) {
				PriorityQueue<Student> students = new PriorityQueue<>();
				List<Student> result = new ArrayList<>();
				for (String event : events) {
					String[] eventValues = event.split("\\s");
					if (eventValues[0].equals("ENTER")) {
						students.add(
										new Student(eventValues[1], Double.valueOf(eventValues[2]), Integer.valueOf(eventValues[3])));
					} else if (eventValues[0].equals("SERVED") && !students.isEmpty()) {
						students.remove();
					}
				}
				while (!students.isEmpty()) result.add(students.poll());
				return result;
			}
		}
		
		static class Solution {
			private final static Scanner scan = new Scanner(System.in);
			private final static Priorities priorities = new Priorities();
			
			public static void main(String[] args) {
				int totalEvents = Integer.parseInt(scan.nextLine());
				List<String> events = new ArrayList<>();
				
				while (totalEvents-- != 0) {
					String event = scan.nextLine();
					events.add(event);
				}
				
				List<Student> students = priorities.getStudents(events);
				
				if (students.isEmpty()) {
					System.out.println("EMPTY");
				} else {
					for (Student st: students) {
						System.out.println(st.getName());
					}
				}
			}
		}
	}
	
	static class Substring {
		//https://www.hackerrank.com/challenges/java-strings-introduction/problem
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			String S = in.next();
			int start = in.nextInt();
			int end = in.nextInt();
			System.out.println(S.substring(start, end));
		}
	}
	
	static class SubstringComparisons {
		//https://www.hackerrank.com/challenges/java-string-compare/problem
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			String S = in.next();
			int start = in.nextInt();
			int end = in.nextInt();
			System.out.println(S.substring(start, end));
		}
	}
	
	static class StringReverse {
		//https://www.hackerrank.com/challenges/java-string-reverse/problem
		public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				String A=sc.next();
				StringBuffer sbr = new StringBuffer(A);
				// To reverse the string
				sbr.reverse();
				System.out.print(A.compareTo(sbr.toString()) < 1 ? "Yes" : "No");
		}
	}
	
	static class StringAnagram {
		//https://www.hackerrank.com/challenges/java-anagrams/problem
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String a = scan.next();
			String b = scan.next();
			scan.close();
			boolean ret = isAnagram(a, b);
			System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
		}
		static boolean isAnagram(String a, String b) {
			final char[] charsA = sortArr(a.toLowerCase().toCharArray());
			final char[] charsB = sortArr(b.toLowerCase().toCharArray());
			String newA = new String(charsA);
			String newB = new String(charsB);
			return newA.equals(newB);
		}
		
		private static char[] sortArr(char[] arr) {
			char temp;
			int i = 0;
			while (i <= arr.length) {
				int j = i + 1;
				while (j < arr.length) {
					if (arr[j] < arr[i]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
					j += 1;
				}
				i += 1;
			}
			return arr;
		}
	}
	
	static class StringTokens {
		//https://www.hackerrank.com/challenges/java-string-tokens/problem
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			scan.useDelimiter("\\Z");
			String s = scan.next().trim();
			if (s.length() > 0) {
				String[] tokens = s.split("[!,?._'@\\s]+");
				System.out.println(tokens.length);
				for (String token : tokens) {
					System.out.println(token);
				}
			} else {
				System.out.println(0);
			}
			scan.close();
			scan.close();
		}
	}
	
	static class PatternChecker {
		//https://www.hackerrank.com/challenges/pattern-syntax-checker/problem
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int testCases = Integer.parseInt(in.nextLine());
			while(testCases>0){
				String pattern = in.nextLine();
				
				try {
					Pattern.compile(pattern);
					System.out.println("Valid");
				} catch(PatternSyntaxException e) {
					System.out.println("Invalid");
				}
				
				testCases--;
			}
		}
	}
	
	static class RegEx {
		//https://www.hackerrank.com/challenges/java-regex/problem
		public String pattern = "\\b((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.|$)){4}\\b";
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			while(in.hasNext()){
				String IP = in.next();
				System.out.println(IP.matches(new RegEx().pattern));
			}
			
		}
	}
	
	static class RegEx2 {
		//https://www.hackerrank.com/challenges/duplicate-word/problem
		public static void main(String[] args) {
			String regex = "\\b(\\w+)(\\b\\W+\\b\\1\\b)*";
			Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
			Scanner in = new Scanner(System.in);
			int numSentences = Integer.parseInt(in.nextLine());
			while (numSentences-- > 0) {
				String input = in.nextLine();
				Matcher m = p.matcher(input);
				// Check for subsequences of input that match the compiled pattern
				while (m.find()) {
					input = input.replaceAll(m.group(0), m.group(1));
				}
				// Prints the modified sentence.
				System.out.println(input);
			}
			in.close();
		}
	}
}
	
