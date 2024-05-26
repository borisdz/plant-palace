# Plant Palace

# Tech Stack
Backend: Java Spring API
Frontend: Angular (Typescript)

# Starting the project

## Backend
Open the `plant-palace` folder with a file explorer or by opening the project with Intellij. Open a terminal and run the command
```
docker compose up
```
If you have the Docker client running the database and the web application should start. The database is listening on address 0.0.0.0 port 5432, and the web application is running on http://localhost:9090.

## Frontend

Open the plant-palace-frontend folder in Visual Studio Code and open a new terminal. Run the following commands
```
npm install
npm run start
```
The project should start on http://localhost:4200.

### Troubleshooting

If you encounter any errors because of the dependencies you can try to delete the node modules folder and package-lock.json file, then run npm install again to get a clean install.
