package com.myslyv4uk.codewars;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Kata {
	private Kata(){}
	
	static class MonkeyCounter {
		//https://www.codewars.com/kata/56f69d9f9400f508fb000ba7
		public static int[] monkeyCount(final int n){
			int[] result = new int[n];
			for(int i = 0; i < n; i++){
				result[i] = i + 1;
			}
			return result;
		}
	}
	
	static class FindOddCubes {
		//https://www.codewars.com/kata/580dda86c40fa6c45f00028a
		public static int cubeOdd(int arr[]) {
			return Arrays.stream(arr)
							.filter(i -> i % 2 != 0)
							.map(i -> i * i * i)
							.reduce(Integer::sum)
							.orElse(0);
		}
	}
	
	static class FormTheMinimum{
		//https://www.codewars.com/kata/5ac6932b2f317b96980000ca
		public static int minValue(int[] values){
			return Arrays.stream(values)
							.distinct()
							.sorted()
							.mapToObj(String::valueOf)
							.reduce(String::concat)
							.map(Integer::valueOf)
							.orElseThrow(UnsupportedOperationException::new);
		}
	}
	
	static class PoetAndPendulum1 {
		//https://www.codewars.com/kata/5bd776533a7e2720c40000e5
		public static int[] pendulum(final int[] values) {
			int[] sortedArray = Arrays.stream(values).sorted().toArray();
			List<Integer> reversedBeginning = IntStream.range(0, sortedArray.length)
							.filter(i -> i % 2 == 0).sorted()
							.mapToObj(i -> sortedArray[i]).sorted(Comparator.reverseOrder())
							.collect(Collectors.toList());
			List<Integer> ending = IntStream.range(0, sortedArray.length)
							.filter(i -> i % 2 != 0)
							.mapToObj(i -> sortedArray[i])
							.collect(Collectors.toList());
			return Stream.concat(reversedBeginning.stream(), ending.stream()).mapToInt(i -> i).toArray();
		}
	}
	
	static class PoetAndPendulum2 {
		//https://www.codewars.com/kata/5bd776533a7e2720c40000e5
		public static int[] pendulum(final int[] values) {
			int[] sortedArray = Arrays.stream(values).sorted().toArray();
			List<Integer> reversedBeginning = IntStream.range(0, sortedArray.length)
							.filter(i -> i % 2 == 0).sorted()
							.mapToObj(i -> sortedArray[i]).sorted(Comparator.reverseOrder())
							.collect(Collectors.toList());
			List<Integer> ending = IntStream.range(0, sortedArray.length)
							.filter(i -> i % 2 != 0)
							.mapToObj(i -> sortedArray[i])
							.collect(Collectors.toList());
			return Stream.concat(reversedBeginning.stream(), ending.stream()).mapToInt(i -> i).toArray();
		}
		
		private static boolean isEven(int index) {
			return index % 2 == 0;
		}
	}
	
	static class FlattenAndSortArray {
		//https://www.codewars.com/kata/57ee99a16c8df7b02d00045f
		public static int[] flattenAndSort(int[][] array) {
			return Arrays.stream(array).flatMapToInt(Arrays::stream).sorted().toArray();
		}
	}
	
	static class GrowthOfPopulation {
		// https://www.codewars.com/kata/563b662a59afc2b5120000c6
		public static int nbYear(int p0, double percent, int aug, int p) {
			int nbYears = 0;
			while(p0 < p) {
				nbYears++;
				p0 += p0 * percent/100 + aug;
			}
			return nbYears;
		}
	}
	
	static class StringToNumber {
		//https://www.codewars.com/kata/544675c6f971f7399a000e79
		public static int stringToNumber(String str) {
			return Integer.valueOf(str);
		}
	}
	
	static class NumberToString {
		//https://www.codewars.com/kata/5265326f5fda8eb1160004c8
		public static String numberToString(int num) {
			return Integer.toString(num);
		}
	}
	
	static class RemoveStringSpaces {
		//https://www.codewars.com/kata/57eae20f5500ad98e50002c5
		static String noSpace(final String x) {
			return x.replace(" ", "");
		}
	}
	
	static class AllStarsCodeChallenge {
		//https://www.codewars.com/kata/5865918c6b569962950002a1
		public static int strCount(String str, char letter) {
			return (int)str.chars().filter(x -> x == letter).count();
		}
	}
	
	static class KeepHydrated {
		//https://www.codewars.com/kata/582cb0224e56e068d800003c
		public int Liters(double time)  {
			return (int)Math.floor(time * 0.5);
		}
	}
	
	static class EnoughSpace {
		//https://www.codewars.com/kata/5875b200d520904a04000003
		public static int enough(int cap, int on, int wait){
			int inSaloon = cap - on;
			int waiting = wait - inSaloon;
			return waiting > 0 ? waiting : 0;
		}
	}
	
	static class ReduceButGrow{
		//https://www.codewars.com/kata/57f780909f7e8e3183000078
		public static int grow(int[] x){
			return Arrays.stream(x).reduce(1, (a,b) -> a*b);
		}
	}
	
	static class ThirdAngle {
		//https://www.codewars.com/kata/5a023c426975981341000014
		public static int otherAngle(int angle1, int angle2) {
			return 180 - angle1 - angle2;
		}
	}
	
	static class SquareSum {
		//https://www.codewars.com/kata/515e271a311df0350d00000f
		public static int squareSum(int[] n){
			return Arrays.stream(n).map(x -> x*x).sum();
		}
	}
	
	static class LostWithoutMap {
		//https://www.codewars.com/kata/57f781872e3d8ca2a000007e
		public static int[] map(int[] arr) {
			return Arrays.stream(arr).map(x -> x*2).toArray();
		}
	}
	
	static class AbbreviateTwoWords {
		//https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3
		public static String abbrevName(String name) {
			final String[] words = name.split(" ");
			StringBuilder stringBuilder = new StringBuilder();
			for(int i = 0; i < words.length; i++){
				stringBuilder.append(words[i].substring(0, 1).toUpperCase());
				if(i != words.length - 1){
					stringBuilder.append(".");
				}
			}
			return stringBuilder.toString();
		}
	}
	
	static class DivisibleBy {
		//https://www.codewars.com/kata/55edaba99da3a9c84000003b
		public static int[] divisibleBy(int[] numbers, int divider) {
			return Arrays.stream(numbers)
							.filter(i -> (i % divider) == 0)
							.toArray();
		}
	}
	
	static class TotalPoints {
		//https://www.codewars.com/kata/5bb904724c47249b10000131
		public static int points(String[] games) {
			return Arrays.stream(games).map(TotalPoints::result).reduce(0, Integer::sum);
		}
		
		private static int result(String str) {
			final Integer res1 = Integer.valueOf(str.substring(0, 1));
			final Integer res2 = Integer.valueOf(str.substring(2, 3));
			if (res1 > res2){
				return 3;
			} else if (res1.equals(res2)) {
				return 1;
			}
			return 0;
		}
	}
	
	static class MixedSum {
		//https://www.codewars.com/kata/57eaeb9578748ff92a000009
		public int sum(List<?> mixed) {
			int result = 0;
			for(Object i : mixed){
				if(i instanceof String){
					result += Integer.valueOf((String) i);
				} else {
					result += (Integer) i;
				}
			}
			return result;
		}
	}
	
	static class RemoveChars {
		//https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0
		public static String remove(String str) {
			return str.substring(1, str.length() - 1);
		}
	}
	
	static class Cube {
		//https://www.codewars.com/kata/55c0a79e20be94c91400014b
		private int side;
		
		public int getSide() {
			return side;
		}
		
		public void setSide(int num) {
			this.side = num;
		}
		
	}
	
	static class GrassHopper {
		//https://www.codewars.com/kata/55d24f55d7dd296eb9000030
		public static int summation(int n) {
			int res = 0;
			for(int i = n; i > 0; i--){
				res += i;
			}
			return res;
		}
	}
	
	static class AdderFactory {
		//https://www.codewars.com/kata/54a6d39a478d8e07e4000b69
		public static IntUnaryOperator create(int addTo) {
			return func -> func + addTo;
		}
	}
	
	static class FunctionalProgramming2 {
		//https://www.codewars.com/kata/54a6c6e7478d8ee02d000cd9
		static class Triangle {
			int height;
			int base;
			double area;
			
			void setArea(double a) {
				area = a;
			}
			
			double getArea() {
				return area;
			}
		}
		public static ToDoubleFunction<Triangle> f = t -> {
			double result = t.height * t.base /2.0;
			t.setArea(result);
			return result;
		};
	}
	
	static class FunctionalProgramming1 {
		//https://www.codewars.com/kata/54a6b43e478d8ee14c000a5d
		static class Student {
			String firstName;
			String lastName;
			String studentNumber;
			
			String getFullName() {
				return firstName + " " + lastName;
			}
			
			String getCommaName() {
				return lastName + ", " + firstName;
			}
		}
		public static Function<Student, Boolean> f = p -> {
			return p.getFullName().equals("John Smith") && p.studentNumber.equals("js123");
		};//Make me a function; remember to set the types!
	}
	
	static class Multiply {
		//https://www.codewars.com/kata/50654ddff44f800200000004
		public static Double multiply(Double a, Double b) {
			return a * b;
		}
	}
}
