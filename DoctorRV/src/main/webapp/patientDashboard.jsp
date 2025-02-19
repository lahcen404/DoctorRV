<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Patient Appointments</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-blue-100 flex items-center justify-center min-h-screen">
    <div class="container mx-auto p-6">
        <div class="bg-white shadow-xl rounded-lg p-8 max-w-3xl mx-auto">
            <div class="flex items-center justify-between mb-6">
                <div class="flex items-center space-x-4">
                    <img src="./imgs/DoctorRV.png" alt="Logo" class="w-12 h-12">
                    <h1 class="text-3xl font-bold text-blue-700">Mes Rendez-Vous</h1>
                </div>
                <a href="bookAppointment.jsp" class="bg-blue-500 text-white py-2 px-4 rounded-lg font-semibold hover:bg-blue-600 transition">
                    Prendre un Rendez-Vous
                </a>
            </div>

            <table class="w-full bg-white border border-blue-300 rounded-lg overflow-hidden">
                <thead class="bg-blue-500 text-white">
                    <tr>
                        <th class="py-3 px-4 text-left">Date</th>
                        <th class="py-3 px-4 text-left">Heure</th>
                        <th class="py-3 px-4 text-left">Motif</th>
                        <th class="py-3 px-4 text-left">Statut</th>
                        <th class="py-3 px-4 text-center">Action</th>
                    </tr>
                </thead>
                <tbody class="divide-y divide-blue-200">
                  
                    <tr>
                        <td class="py-3 px-4">2025-02-20</td>
                        <td class="py-3 px-4">10:00 AM</td>
                        <td class="py-3 px-4">Consultation </td>
                        <td class="py-3 px-4 text-green-600 font-semibold">Confirmer</td>
                        <td class="py-3 px-4 text-center">
                            <a href="cancelAppointment.jsp?id=1" class="bg-red-500 text-white px-3 py-1 rounded-lg hover:bg-red-600">Cancel</a>
                        </td>
                    </tr>
                    
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>
