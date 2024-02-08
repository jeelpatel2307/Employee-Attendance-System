import datetime

class Employee:
    def __init__(self, emp_id, emp_name):
        self.emp_id = emp_id
        self.emp_name = emp_name
        self.attendance_records = {}

    def mark_attendance(self):
        today = datetime.date.today()
        if today not in self.attendance_records:
            self.attendance_records[today] = "Present"
            print(f"{self.emp_name} marked present for {today}")
        else:
            print(f"{self.emp_name} has already been marked present for {today}")

    def display_attendance(self):
        print(f"Attendance Record for {self.emp_name}:")
        for date, status in self.attendance_records.items():
            print(f"{date}: {status}")


def main():
    # Create employees
    emp1 = Employee(101, "Alice")
    emp2 = Employee(102, "Bob")

    # Mark attendance
    emp1.mark_attendance()
    emp1.mark_attendance()
    emp2.mark_attendance()

    # Display attendance
    emp1.display_attendance()
    emp2.display_attendance()


if __name__ == "__main__":
    main()
