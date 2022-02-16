import java.io.IOException;
import java.util.Scanner;

class ResultPDF {
    public static int designerPdfViewer(int[] h, String word) {
        int maxHeight = 0;//Initialized to 0 because it is below the minimum range for height
        for (int i = 0; i < word.length(); i++) //zaba
        {
            if (maxHeight < h[word.charAt(i) - 97]) //  determines if the height of the current letter is greater than max so far
            {                                    //97 is subtracted because we are using the int value of our letter for indexing
                maxHeight = h[word.charAt(i) - 97];
            }
        }
        return (maxHeight * word.length());
    }
}

public class SolutionPDF {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = 26;
        int[] h = new int[n];
        for (int h_i = 0; h_i < n; h_i++) {
            h[h_i] = scan.nextInt();
        }
        String word = scan.next();
        int result = ResultPDF.designerPdfViewer(h, word);
        System.out.println(result);
        scan.close();
    }
}

