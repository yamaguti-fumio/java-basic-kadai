const stripe = Stripe('pk_test_51QTZwHJjGqwzMHXoSsumKdPVIs6ZuVzxLLckVRqMLwEOMfuvKUHbA7s9HQbRATpJlkGv5dkEWk3wvxLPOveUHQwe00ymtSRLpK');
 const paymentButton = document.querySelector('#paymentButton');
 
 paymentButton.addEventListener('click', () => {
   stripe.redirectToCheckout({
     sessionId: sessionId
   })
 });