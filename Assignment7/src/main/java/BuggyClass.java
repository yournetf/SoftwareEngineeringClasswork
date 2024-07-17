public class BuggyClass {

    public int buggyMethod1(int x, int y){
        int result = 0;
        if(x > 10){
            result = x/(x-y);
        }
        if (x > 100){
            result += 10;
            result = result / 10;
            result = 100;
        }
        return result;
    }

    public void buggyMethod2(int x){
        //  With 100% statement coverage, it is possible to have any real number > 50 percent of branches covered
        // during testing. This is because with no new branches introduced, the code starts with only one branch,
        // to which 100% statement coverage would cover. Every time there is a new branch introduced
        // (i.e. an if-statement or while-loop), a max of one "non-visible" branch is created per current "visible" branch.
        // Therefore, out of the total branches, there will always be less than or equal to 50% that are "not-visible".
        //In this particular situation, the fault must lie in the realm of over 50% "non-visible" branches, which
        //is simply not possible.
    }

    public int buggyMethod3(int x){
        int keepAwayFromZero = -6;
        if (x>5) {
            keepAwayFromZero = keepAwayFromZero+x;
        }
        return x/keepAwayFromZero;
    }

    public void buggyMethod4(){
        // If every branch is covered, then every statement within those branches must also be executed,
        // and thus achieving 100% branch coverage would also result in achieving 100% statement coverage in
        // some instance. Essentially if you find an error with 100% statement coverage, it is impossible to not
        // locate the same error with 100% branch coverage.
    }

    public void buggyMethod5(){
        // Because of the nature of the line "x = i/0", it will always reveal a division by 0 error. Achieving 100% statement
        // coverage will always execute every visible line within the code. Therefore, because of the nature of the 4th line
        // and a 100% statement coverage, the error will always be revealed in this instance.
    }


}