package ch06_array.sort;

public class SortTest {
    public static void main(String[] args) {
        int[] arr = {7,4,5,1,3};

        System.out.println("정렬 전");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();

//      버블 정렬
//      bubbleSort(arr);

//      선택 정렬
//      selectionSort(arr);

//      삽입 정렬
      insertionSort(arr);


        System.out.println("정렬 후");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void bubbleSort(int[] arr) {
        int last = arr.length - 1;

        for (int i = 0; i < last; i++) { // 3. 전체 회전 수 (맨마지막 대결은 할 필요X)
            for (int j = 0; j < last - i; j++) { // 2. 1회전 돌리기 (인덱스3 vs 인덱스4까지만 대결) // -i : 범위 좁혀가기
                if (arr[j] > arr[j+1]) { // 1. 인접한 두 숫자를 비교해서 큰 걸 오른쪽으로 교환
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

    }

    private static void selectionSort(int[] arr) {
        int last = arr.length - 1;

        for(int i = 0; i < last; i++){
            // 1. 기준값을 정한다.
            int minIdx = i;

            for(int j = i+1; j < last + 1; j++){ // 2. 오른쪽으로 돌면서 최솟값을 찾으면 인덱스를 기억해둔다.
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            // 인덱스를 쓰지 않고 값만 사용할 수는 없다.
            // 값을 교환하려면 최솟값의 인덱스를 기억해두는 게 필요하기 때문.

            int tmp = arr[minIdx]; // 3. 기준값과 최솟값의 자리를 바꾼다.
            arr[minIdx] = arr[i];
            arr[i] = tmp;
        }
    }

    private static void insertionSort(int[] arr) {
        int last = arr.length; // 5

        for (int i = 1; i < last; ++i) {  // 기준값 : 두번째 값 ~> 마지막 값 (전체 순회)
            int key = arr[i]; // 기준값

            int j = i - 1; // 왼쪽 숫자를 비교값으로 세팅
            while (0 <= j && key < arr[j]) { // j가 음수가 아니고, 기준값이 비교값보다 작을 동안 반복한다.
                arr[j + 1] = arr[j];
                j--;
            }

           arr[j + 1] = key;

            // 내부의 루프는 배열을 순회하면서 각 요소를 적절한 위치(A < key < B)에 삽입하여 정렬합니다.
            // key보다 큰 요소들을 한 칸씩 오른쪽으로 이동
        }
    }
}
