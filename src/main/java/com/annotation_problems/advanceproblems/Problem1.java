/*
5️⃣ Implement a Role-Based Access Control with @RoleAllowed
✅ Problem Statement:
Define a class-level annotation @RoleAllowed to restrict method access based on roles.
🔹 Requirements:
@RoleAllowed("ADMIN") should only allow ADMIN users to execute the method.
Simulate user roles and validate access before invoking the method.
If a non-admin tries to access it, print Access Denied!
*/

package com.annotation_problems.advanceproblems;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

// Step 1: Define the Custom Annotation
@Retention(RetentionPolicy.RUNTIME) // Available at runtime
@Target(ElementType.METHOD) // Can be applied to methods
@interface RoleAllowed {
    String value(); // Role required for access
}

// Step 2: Create a Service Class with Restricted Methods
class SecureService {

    @RoleAllowed("ADMIN")
    public void performAdminTask() {
        System.out.println("Admin task executed successfully!");
    }

    @RoleAllowed("USER")
    public void performUserTask() {
        System.out.println("User task executed successfully!");
    }
}

// Step 3: Simulate Role-Based Access Control
public class Problem1 {
    public static void main(String[] args) {
        SecureService service = new SecureService();

        // Simulating different users
        executeMethodWithRole(service, "performAdminTask", "ADMIN");  // Allowed
        executeMethodWithRole(service, "performAdminTask", "USER");   // Denied
        executeMethodWithRole(service, "performUserTask", "USER");    // Allowed
        executeMethodWithRole(service, "performUserTask", "GUEST");   // Denied
    }

    // Step 4: Check Role Before Invoking the Method
    public static void executeMethodWithRole(Object obj, String methodName, String userRole) {
        try {
            Method method = obj.getClass().getMethod(methodName);

            if (method.isAnnotationPresent(RoleAllowed.class)) {
                String requiredRole = method.getAnnotation(RoleAllowed.class).value();

                if (userRole.equals(requiredRole)) {
                    method.invoke(obj); // Execute method if role matches
                } else {
                    System.out.println("Access Denied! " + userRole + " is not allowed to execute " + methodName);
                }
            } else {
                System.out.println("No role restriction on this method.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}