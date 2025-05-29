function daysBetweenDates(date1: string, date2: string): number {
    // Define the two dates
const date11 = new Date(date1);
const date22 = new Date(date2);

// Get the difference in milliseconds (explicit type conversion using .getTime())
const diffInMilliseconds = date22.getTime() - date11.getTime();

// Convert milliseconds to days
const diffInDays =  Math.abs(diffInMilliseconds / (1000 * 60 * 60 * 24));
console.log(`Difference in days: ${diffInDays}`);

return diffInDays; 

};