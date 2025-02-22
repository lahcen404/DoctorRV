
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <script>
        function redirectUser(event) {
            event.preventDefault(); // Prevent form submission
            var role = document.getElementById("role").value;
            if (role === "doctor") {
                window.location.href = "doctorDashboard.jsp";
            } else {
                window.location.href = "patientDashboard.jsp";
            }
        }
    </script>
</head>
<body class="bg-blue-100 flex items-center justify-center min-h-screen">
    <div class="container mx-auto flex items-center justify-center">
        <div class="bg-white shadow-xl rounded-lg p-8 w-full max-w-md">
            <div class="flex items-center space-x-4 mb-6">
                <img src="./imgs/DoctorRV.png" alt="Logo" class="w-12 h-12">
                <h2 class="text-3xl font-bold text-blue-700">Login</h2>
            </div>
            <form class="space-y-4" onsubmit="redirectUser(event)">
                <div>
                    <label class="block text-blue-800 font-semibold mb-1 text-left">Select Role</label>
                    <select id="role" class="w-full px-4 py-2 border border-blue-400 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-600 bg-blue-50" required>
                        <option value="patient">Patient</option>
                        <option value="doctor">Doctor</option>
                    </select>
                </div>
                <div>
                    <label class="block text-blue-800 font-semibold mb-1 text-left">Username </label>
                    <input type="text" name="username" class="w-full px-4 py-2 border border-blue-400 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-600 bg-blue-50" required>
                </div>
                <button type="submit" class="w-full bg-blue-700 text-white py-3 rounded-lg font-semibold hover:bg-blue-800 transition">Login</button>
            </form>
        </div>
    </div>
</body>
</html>
