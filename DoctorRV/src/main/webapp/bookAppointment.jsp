<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Book Appointment</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-blue-100 flex items-center justify-center min-h-screen">
    <div class="container mx-auto flex items-center justify-center">
        <div class="bg-white shadow-xl rounded-lg p-8 w-full max-w-md">
            <div class="flex items-center space-x-4 mb-6">
                <img src="./imgs/DoctorRV.png" alt="Logo" class="w-12 h-12">
                <h2 class="text-3xl font-bold text-blue-700">Book Appointment</h2>
            </div>
            <form action="bookAppointmentServlet" method="POST" class="space-y-4">
                <div>
                    <label class="block text-blue-800 font-semibold mb-1 text-left">Username</label>
                    <input type="text" name="username" class="w-full px-4 py-2 border border-blue-400 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-600 bg-blue-50" required>
                </div>
                <div>
                    <label class="block text-blue-800 font-semibold mb-1 text-left">Email</label>
                    <input type="email" name="email" class="w-full px-4 py-2 border border-blue-400 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-600 bg-blue-50" required>
                </div>
                <div>
                    <label class="block text-blue-800 font-semibold mb-1 text-left">Telephone</label>
                    <input type="tel" name="telephone" class="w-full px-4 py-2 border border-blue-400 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-600 bg-blue-50" required>
                </div>
                <div>
                    <label class="block text-blue-800 font-semibold mb-1 text-left">Date</label>
                    <input type="date" name="date" class="w-full px-4 py-2 border border-blue-400 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-600 bg-blue-50" required>
                </div>
                
                <div>
                    <label class="block text-blue-800 font-semibold mb-1 text-left">Motif</label>
                    <textarea name="motif" class="w-full px-4 py-2 border border-blue-400 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-600 bg-blue-50" rows="3" required></textarea>
                </div>
                <button type="submit" class="w-full bg-blue-700 text-white py-3 rounded-lg font-semibold hover:bg-blue-800 transition">Book Now</button>
            </form>
        </div>
    </div>
</body>
</html>
