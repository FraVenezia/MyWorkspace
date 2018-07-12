SELECT Booking.NumBooking,
	   Booking.BookingDate,
	   Customer.Nome,
	   Customer.Cognome,
	   Customer.Email,
	   Room.Num,
	   Room.TypeRoom,
	   BookingRoom.CheckIn,
	   BookingRoom.CheckOut,
	   BookingRoom.Price
FROM   Booking
JOIN   Customer,
       Room,
       BookingRoom
WHERE  Customer.IDUser=Booking.IDUSer
AND    Booking.NumBooking=BookingRoom.NumBooking
AND    BookingRoom.IDRoom=Room.IDRoom