package grd;

public class Grade {

int total;

public Grade(int total){
this.total = total;
}

public char getGrade () {
if (total >= 360) return 'A';
else if (total >= 300 && total <= 359) return 'B';
else if (total >= 240 && total <= 299) return 'C';
return 'F';
}

}