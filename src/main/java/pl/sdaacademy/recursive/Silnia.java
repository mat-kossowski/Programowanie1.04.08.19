package pl.sdaacademy.recursive;

public class Silnia {

    public long iteration(int index) {


        long accumulator = 1;

        for (int i = 1; i <= index; i++) {
            accumulator *= i;
//            accumulator = accumulator *i;
        }
        return accumulator;

    }

    public long recursive(int index){

        if (index == 0) return 1;

        return index * recursive(index - 1);


    }

}
