/**
 *есть два отсортированных массива.
 * Нужно объединить их в 1, который также будет отсортированный.
 * Пузырек и другие алгоритмы сортировки сложности O(n^2) использовать нельзя
 */
public class Task11 {
    public static void main(String[] args) {
        int [] a;
        int [] b;
        a=new int[3];
        b=new int[8] ;
        int i, j, k, x,y;
i=0;
j=0;
        k=0;
        System.out.println("Первый массив: ");

        for ( x=0; x<a.length;) {
            a[x]=(int)(Math.random()*100);
            System.out.print(a[x]+" ");
            x++;
        }

        System.out.println();
        System.out.println("Второй массив: ");
        for (y=0; y<b.length;){
            b[y]=(int)(Math.random()*100);
            System.out.print(b[y]+" ");
          y++;
        }
        sortMassive (a);
        sortMassive (b);

        int [] result=new int[a.length+b.length];
        System.out.println();
        System.out.println("Результат сортировки: ");


            while (i<a.length && j<b.length){
                if (a[i]<b[j]) {
                    result[k] = a[i];
                    i++;
                }
                else {
                    result[k]= b[j];
                    j++;
                }
                System.out.print(result[k]+ " ");
                k++;

            }
            while (i< a.length){
                result[k]=a[i];
                i++;
                System.out.print(result[k]+ " ");
                k++;
            }
            while (j< b.length){
                result[k]=b[j];

                j++;
                System.out.print(result[k]+ " ");
                k++;
            }


    }



    public static int[] sortMassive(int... score) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < score.length-1; i++) {
                if (score[i] > score[i + 1]) {
                    temp = score[i];
                    score[i] = score[i + 1];
                    score[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        return score;
    }
        }


