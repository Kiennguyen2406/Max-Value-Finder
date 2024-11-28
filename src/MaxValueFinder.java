public class MaxValueFinder {
    // Hàm tìm giá trị lớn nhất trong mảng số nguyên
    public static int findMaxValue(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Mảng không được rỗng hoặc null.");
        }

        int max = array[0]; // Gán giá trị phần tử đầu tiên làm max ban đầu
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Cập nhật giá trị max nếu tìm thấy phần tử lớn hơn
            }
        }
        return max;
    }
}
