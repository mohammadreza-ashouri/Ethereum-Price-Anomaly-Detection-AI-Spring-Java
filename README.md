# Ethereum Price Anomaly Detector

Hi there fellow coders! 😃 I'm Mo Ashouri (you can contact me at ashourics@gmail.com), and this is a little project I've been workin' on.

## What's this thing for?
It's a simple app built with Spring Boot in Java. It fetches the current Ethereum price from Coingecko's API and checks for any anomaly in the price changes. Pretty handy, right? 😎

## Tech stack
Here's a rundown of the tech used in this project:
- **Spring Boot**: For the app framework. It makes everything SO easy, I'm telling ya!
- **Java**: The one and only. 😁
- **MongoDB**: For stashing the fetched Ethereum prices. You could switch to a different DB if you prefer.
- **Coingecko API**: For fetching the current Ethereum price.
- **Spring Data MongoDB**: For easy interaction with MongoDB. It's a lifesaver, for real.
- **Isolation Forest**: A machine learning algorithm used for anomaly detection in the Ethereum price changes.

## How to install and run the thing
1. First, make sure you've got Java 11 (or later) and Maven installed. You'll also need MongoDB running locally, or you could use a MongoDB Atlas cluster if you prefer (just remember to update the connection string in `application.properties`).

2. Clone this repo to your local machine:

```
git clone https://github.com/<username>/ethereum-price-anomaly-detector.git
```

3. Navigate to the project directory:

```cd ethereum-price-anomaly-detector```
4. Run the project with Maven:

```mvn spring-boot:run```

5. The app should now be running at `http://localhost:8080`. 🎉

Remember, this is a simple project and there's plenty of room for improvement. You can add more features, switch to a different DB, use a different API for fetching the Ethereum price, refine the anomaly detection algorithm, and so on. Happy coding, everyone! 🚀

(And yeah, you might find some typos in this README, sorry about that 😅 I'm too excited about coding to worry about perfect spelling lol)

---

Contact me at ashourics@gmail.com if you've got any questions or suggestions. Happy to help out!

Mo Ashouri

