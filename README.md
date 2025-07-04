# SmartLeaveProject
SmartLeave: A Java-Based Employee Leave and Risk Management System

# Employee Leave Management System

## Overview
This Java program simulates a simple employee leave management system, including:
- Employee creation with roles
- Separation of Duties (SoD) conflict detection
- Leave request approval with balance checking

## Features
- Detect SoD conflicts between "Approver" and "Processor"
- Automatically deduct leave if approved
- Prevent approval if employee has conflicting roles or insufficient balance

## Classes
- `Employee.java`: Holds employee data and business logic
- `LeaveRequest.java`: Represents leave requests and includes approval logic
- `Main.java`: Runs the demo with sample data

## Sample Output
Employee{id=101, name='Alice', role='[Approver, Processor]', leaveBalance=5}
Employee{id=102, name='Bob', role='[Viewer]', leaveBalance=2}
Employee{id=103, name='Carlos', role='[Processor]', leaveBalance=3}
Employee{id=104, name='Diana', role='[Approver]', leaveBalance=1}
SoD Conflict: Alice has conflicting roles (Approver & Processor)
Bob has no SoD conflict.
Carlos has no SoD conflict.
Diana has no SoD conflict.
LeaveRequest{employeeId=101, startDate=2025-06-16, endDate=2030-06-16, type='Vacation', daysRequested=1, approved=false}
LeaveRequest{employeeId=102, startDate=2024-06-16, endDate=2024-06-16, type='Sick', daysRequested=2, approved=true}
Approval denied due to SoD conflict for Alice
Leave approved.

Leave Requests:
LeaveRequest{employeeId=101, startDate=2025-06-16, endDate=2030-06-16, type='Vacation', daysRequested=1, approved=false}
LeaveRequest{employeeId=102, startDate=2024-06-16, endDate=2024-06-16, type='Sick', daysRequested=2, approved=true}

Updated Employee Info: 
Employee{id=101, name='Alice', role='[Approver, Processor]', leaveBalance=5}
Employee{id=102, name='Bob', role='[Viewer]', leaveBalance=0}
