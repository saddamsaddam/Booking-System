document.getElementById('bookingForm').addEventListener('submit', function(e) {
    e.preventDefault();
  
    // Get form values
    var name = document.getElementById('name').value;
    var date = document.getElementById('date').value;
    var time = document.getElementById('time').value;
  
    // Create booking status message
    var statusMessage = document.createElement('p');
    statusMessage.innerText = 'Booking confirmed for ' + name + ' on ' + date + ' at ' + time + '.';
  
    // Display booking status
    var bookingStatus = document.getElementById('bookingStatus');
    bookingStatus.innerHTML = '';
    bookingStatus.appendChild(statusMessage);
  });