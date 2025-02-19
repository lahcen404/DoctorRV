<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Patient Choice</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-blue-100 flex items-center justify-center min-h-screen">
    <div class="container mx-auto flex flex-col items-center justify-center space-y-6">
        <div class="bg-white shadow-xl rounded-lg p-8 w-full max-w-md text-center">
            <img src="./imgs/DoctorRV.png" alt="Logo" class="w-16 h-16 mx-auto mb-4">
            <h2 class="text-3xl font-bold text-blue-700 mb-6">Patient Portal</h2>
            
            <a href="Form-Patient.jsp" class="w-full block bg-blue-700 text-white py-3 rounded-lg font-semibold hover:bg-blue-800 transition mb-4">First Time? Register</a>
            
            <a href="login.jsp" class="w-full block bg-green-600 text-white py-3 rounded-lg font-semibold hover:bg-green-700 transition">Already Registered? Log In</a>
        </div>
        
        <a href="Home.jsp" class="text-blue-700 font-semibold hover:underline"> Back to Home</a>
    </div>
</body>
</html>