<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Book Appointment</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <style>
        body {
            background: linear-gradient(to right, #c2e9fb, #a1c4fd);
            min-height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
        }
    </style>
</head>
<body>
    <div class="bg-white shadow-xl rounded-xl p-8 w-full max-w-lg">
        <div class="text-center mb-6">
            <img src="./imgs/DoctorRV.png" alt="Logo" class="w-16 h-16 mx-auto mb-3">
            <h2 class="text-3xl font-bold text-blue-700">Book Appointment</h2>
            <p class="text-gray-600">Fill in the form below to schedule an appointment</p>
        </div>
        <form action="bookingServlet" method="POST" class="space-y-5">
            <div>
                <label class="block text-blue-800 font-semibold">Username</label>
                <input type="text" name="username" class="w-full px-4 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-600 bg-gray-100" required>
            </div>
            <div>
                <label class="block text-blue-800 font-semibold">Email</label>
                <input type="email" name="email" class="w-full px-4 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-600 bg-gray-100" required>
            </div>
            <div>
                <label class="block text-blue-800 font-semibold">Telephone</label>
                <input type="tel" name="telephone" class="w-full px-4 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-600 bg-gray-100" required>
            </div>
            <div>
                <label class="block text-blue-800 font-semibold">Date</label>
                <input type="date" name="date" class="w-full px-4 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-600 bg-gray-100" required>
            </div>
            <div>
                <label class="block text-blue-800 font-semibold">Motif</label>
                <textarea name="motif" class="w-full px-4 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-600 bg-gray-100" rows="3" required></textarea>
            </div>
            <button type="submit" class="w-full bg-blue-700 text-white py-3 rounded-lg font-semibold hover:bg-blue-800 transition">Book Now</button>
            <a href="patientSpace.jsp" class="w-full text-center block border-2 border-blue-700 text-blue-700 py-3 rounded-lg font-semibold hover:bg-blue-700 hover:text-white transition">Back</a>
        </form>
    </div>
</body>
</html>
