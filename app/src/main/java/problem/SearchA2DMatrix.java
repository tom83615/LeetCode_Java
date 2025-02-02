package problem;

public class SearchA2DMatrix {

//    Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:
//
//    Integers in each row are sorted from left to right.
//    The first integer of each row is greater than the last integer of the previous row.
//
//
//    Example 1:
//    Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
//    Output: true

//    Example 2:
//    Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
//    Output: false
//
//    Constraints:
//    m == matrix.length
//    n == matrix[i].length
//    1 <= m, n <= 100
//    -104 <= matrix[i][j], target <= 104
    public static boolean searchMatrix(int[][] matrix, int target) {
        // search rows
        int row = 0;
        if(matrix.length > 1){
            while(row < matrix.length-1 && matrix[row+1][0] <= target){
                row++;
            }
        }

        // binery search in the row
        return binarySearch(matrix[row], 0, matrix[row].length, target);
    }

    public static boolean binarySearch(int[] list, int start, int end, int target) {
        int mid = (start+end)/2;
        if(list[mid] == target){
            return true;
        }else{
            if(start+1 < end){
                if(list[mid] > target){
                    return binarySearch(list, start, mid, target);
                }else{
                    return binarySearch(list, mid, end, target);
                }
            }else{
                return false;
            }
        }
    }
}
