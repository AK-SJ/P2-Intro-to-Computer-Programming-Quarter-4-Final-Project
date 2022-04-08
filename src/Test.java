
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] testTwo = { "last", "day", "of", "the", "school", "year" };

		String[] resultTwo = strArrMethod(testTwo);

	}

	public static String[] strArrMethod(String[] arr)

	{

		String[] result = new String[arr.length];

		for (int j = 0; j < arr.length; j++)

		{

			String sm = arr[j];
			
			for (int k = j + 1; k < arr.length; k++)

			{

				if (arr[k].length() < sm.length())

				{
					System.out.println(sm+":"+arr[k]);

					sm = arr[k]; // Line 12
					

				}

			}

			result[j] = sm;

		}

		return result;

	}
}
