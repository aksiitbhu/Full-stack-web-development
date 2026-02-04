import xml.etree.ElementTree as ET

tree = ET.parse("students.xml")
root = tree.getroot()

for student in root.findall("student"):
    sid = student.get("id")
    name = student.find("name").text
    course = student.find("course").text
    marks = student.find("marks").text

    print(f"ID: {sid}, Name: {name}, Course: {course}, Marks: {marks}")
