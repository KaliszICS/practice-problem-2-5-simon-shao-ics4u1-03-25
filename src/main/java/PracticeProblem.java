public class PracticeProblem {

	public static void main(String args[]) {
		char[] arr = {'b', 'f', 'a', 'c', 'g', 'd', 'e'};
		insertionSort(arr);
		for (int i = 0; i<arr.length;i++){
			System.out.println(arr[i] + " ");
		}
	}

public static void insertionSort(char[] characters) {
char key;
int index;
for (int i = 1; i<characters.length;i++){
key = characters[i];
index = i-1;
while (index>=0&& characters[index]>key){
characters[index+1] = characters[index];
index--;
}

characters[index+1] = key;
}


}
}
