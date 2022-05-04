package entities;
import enums.Label;

public class Review {
    private int grade;
    private Label label;

    public Review(int grade){
        this.grade = grade;
        if(grade == 1) this.label = Label.HATE;
        if(grade == 2) this.label = Label.DISLIKE;
        if(grade == 3) this.label = Label.OK;
        if(grade == 4) this.label = Label.GOOD;
        if(grade == 5) this.label = Label.EXCELENT;

    }
    public void setGrade(int grade){this.grade = grade;}
    public void setLabel(Label label){this.label = label;}
    public int getGrade(){return grade;}
    public Label getLabel(){return label;}

    @Override
    public String toString() {
        return "Stars: " + grade + " / 5 \n" + label + "\n";
    }

    public int compareTo(Review r) {return r.grade - this.grade;}
}
