package ru.mirea.lab15.ex1;


public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController() {

    }
    public Student getModel() {
        return model;
    }

    public StudentView getView() {
        return view;
    }

    public void setModel(Student model) {
        this.model = model;
    }

    public void setView(StudentView view) {
        this.view = view;
    }

    public void updateView() {
        view.printStudentDetails(model.getName(), getModel().getRollNo());
    }
}