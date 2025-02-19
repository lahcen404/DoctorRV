<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>DoctorRV - Choose Space</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <style>
        .bg-medical {
            background-image: url('https://images.pexels.com/photos/4386467/pexels-photo-4386467.jpeg'); /* Replace with your own medical-themed image */
            background-size: cover;
            background-position: center;
            
        }
    </style>
</head>
<body class="bg-medical bg-cover bg-no-repeat flex items-center justify-center min-h-screen">

    <div class="bg-white bg-opacity-80 p-12 rounded-lg shadow-xl w-full max-w-lg">
        <div class="text-center mb-8">
            <img src="./imgs/DoctorRV.png" alt="Logo" class="w-16 h-16 mx-auto mb-4">
            <h2 class="text-4xl font-bold text-blue-800">DoctorRV</h2>
            <h3 class="text-xl font-semibold text-blue-700 mt-4">Choose Your Space</h3>
        </div>
        
        <div class="flex justify-between space-x-4">
            <a href="patientSpace.jsp" class="w-full bg-blue-700 text-white py-4 rounded-lg font-semibold text-center hover:bg-blue-800 transition">Patient Space</a>
            <a href="login.jsp" class="w-full bg-blue-700 text-white py-4 rounded-lg font-semibold text-center hover:bg-blue-800 transition">Doctor Space</a>
        </div>
    </div>

</body>
</html>
