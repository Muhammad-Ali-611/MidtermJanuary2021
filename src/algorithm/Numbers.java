package MidtermJanuary2021.src.algorithm;

import MidtermJanuary2021.src.databases.ConnectToSqlDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 *Created by mrahman on 04/02/2018.
 */
public class Numbers<num> {

	public Numbers() throws Exception {
	}

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
	 *
	 */

	public static ArrayList<String> main(String[] args) throws Exception {

		int[] num = new int[10];
		storeRandomNumbers(num);
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		String DATABASE_URL = "jdbc:mysql://localhost:3306/SortingNumbers";
		Connection connection;
		Statement statement;
		ResultSet resultSet;
		String query;
   public ConnectToSqlDB() {
			try {
				//connect to the database and create the Prepared Statements
				//latest version jdbc driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection(DATABASE_URL, "root", "christniru");
				statement = ((Connection) connection).createStatement();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		public void insertDataFromArrayToSqlTable ( int num1[], String1, sortAlgo, String ,Object Object database;
		database){
			//---------------------------------
			try {
				for (int i = 0; i < num.length; i++) {
					query = "insert into " + sortAlgo + "(element) values('" + num[i] + "')";
					statement.executeUpdate(query);
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		//---------------------------------------
		public ArrayList<String> readDataBase (String sortAlgo, String database){
			ArrayList<String> list = new ArrayList<String>();
			query = "select * from " + sortAlgo;
			try {
				resultSet = statement.executeQuery(query);
				while (resultSet.next()) {
					list.add(resultSet.getString(1));
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			return list;
		}
	}
		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
	private ConnectToSqlDB connectToSqlDB;
	List<String> selectionSortNumbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
	    printValue(selectionSortNumbers) throws Exception {
	     int n = num.Length;
		randomize (num, n);
		//Insertion Sort
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.Length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
			ConnectToSqlDB connectToSqlDB;
			connectToSqlDB.insertDataFromArrayToSqlTable(num, "insertion_sort", "SortingNumbers");
		List<String> insertionSortNumbers = connectToSqlDB.readDataBase("insertion_sort", "SortingNumbers");
	//By following above, Continue for rest of the Sorting Algorithm....

	void randomize(num, n) {

	}
	//bubble Sort
		algo.bubbleSort(num);
		long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort take: " + bubbleSortExecutionTime + " milli sec");

	}
	//Come to conclusion about which Sorting Algo is better in given data set of 1000000.


	public static void storeRandomNumbers(int [] num){
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			num[i] = rand.nextInt(1000000);
		}
	}

	public static void randomize( int arr[], int n)
	{
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void printValue(List<String> array){
		for(String st:array){
			System.out.println(st);
		}
	}
}
