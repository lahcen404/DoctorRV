<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Doctor Dashboard</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-blue-100 flex items-center justify-center min-h-screen">
    <div class="container mx-auto p-6">
        <div class="bg-white shadow-xl rounded-lg p-6">
            <div class="flex items-center justify-between mb-6">
                <h2 class="text-3xl font-bold text-blue-700">Doctor Dashboard</h2>
                <a href="login.jsp" class="bg-red-500 text-white px-4 py-2 rounded-lg hover:bg-red-600">Logout</a>
            </div>

            <h3 class="text-xl font-semibold text-blue-600 mb-4">Upcoming Appointments</h3>
            <table class="w-full bg-white border border-gray-300 rounded-lg">
                <thead>
                    <tr class="bg-blue-600 text-white">
                        <th class="py-2 px-4 border">Patient Name</th>
                        <th class="py-2 px-4 border">Email</th>
                        <th class="py-2 px-4 border">Date</th>
                        <th class="py-2 px-4 border">Motif</th>
                        <th class="py-2 px-4 border">Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <tr class="text-center border-b">
                        <td class="py-2 px-4 border">John Doe</td>
                        <td class="py-2 px-4 border">john@example.com</td>
                        <td class="py-2 px-4 border">2025-02-20</td>
                        <td class="py-2 px-4 border">General Checkup</td>
                        <td class="py-2 px-4 border">
                            <a href="editAppointment.jsp?id=1" class="bg-yellow-500 text-white px-3 py-1 rounded-lg hover:bg-yellow-600">Edit</a>
                            <a href="cancelAppointment.jsp?id=1" class="bg-red-500 text-white px-3 py-1 rounded-lg hover:bg-red-600">Cancel</a>
                        </td>
                    </tr>
                    
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>
