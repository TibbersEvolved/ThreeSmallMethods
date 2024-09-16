public class ThreeSmallMethods {
    private final int twoDigitMax = 100;
    private final int twoDigitMin = 9;
    private final int lenghtPersonalNum = 10;
    private final int lenghtPersonalNumFull = 12;
    private final int ageYoung = 30;
    private final int ageBorn = 0;

    public boolean isYoung(int age) {
        if(age <= ageYoung && age >= ageBorn)
        {
            return true;
        }
        return false;
    }

    public boolean hasLegalGenderManInSweden(String personalNumber){
        int arrayLength = personalNumber.length();
        if (arrayLength == lenghtPersonalNum || arrayLength == lenghtPersonalNumFull)
        {
            int genderIdentifier = Character.getNumericValue(personalNumber.charAt(arrayLength-2));
            if(genderIdentifier % 2 == 1)
            {
                return true;
            }
        }
        return false;
    }

    public int firstTwoDigitInteger(int[] numbers) {
        for(int i = 0; i < numbers.length; i ++)
        {
            if(isTwoDigit(numbers[i])) return numbers[i];
        }
        return -1;
    }
    private boolean isTwoDigit(int number) {
        if(Math.abs(number) > twoDigitMin && Math.abs(number) < twoDigitMax)
        {
            return true;
        }
        return false;
    }
}
