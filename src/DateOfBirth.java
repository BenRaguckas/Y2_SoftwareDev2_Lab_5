public class DateOfBirth {
    private int Day = 1;    // Some default values to avoid null
    private int Month = 1;
    private int Year = 1900;
    private boolean BC = false; // Joke variable
    public DateOfBirth(){}  // Initialize basic DoB
    public DateOfBirth(int day, int month, int year){   // Initialize basic DoB
        Day = day;
        Month = month;
        Year = year;
    }
    public DateOfBirth(int day, int month, int year, boolean BC){   // Initialize DoB with BC specified
        Day = day;
        Month = month;
        Year = year;
        this.BC = BC;
    }
    public void setDay(int day) {
        Day = day;
    }
    public void setMonth(int month) {
        Month = month;
    }
    public void setYear(int year) {
        Year = year;
    }
    public int getDay() {
        return Day;
    }
    public int getMonth() {
        return Month;
    }
    public int getYear() {
        if (BC)
            return -Year;
        else
            return Year;
    }
    @Override
    public String toString(){
        String month_date,day_date;
        if (Month < 10)
            month_date = "0" + Month;
        else
            month_date = "" + Month;
        if (Day < 10)
            day_date = "0" + Day;
        else
            day_date = "" + Day;
        if (BC)
            return ""+day_date+" / "+month_date+" / "+Year+" BC";
        else
            return ""+day_date+" / "+month_date+" / "+Year;
    }
}
