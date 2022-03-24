import PlayersTable from "../components/admin/Player/PlayersTable";
import AddPlayers from "../components/admin/Player/AddPlayers";

import axios from "axios";


function AdminPlayersPage(){

    function getHeaders(){
        let config = {
            headers: {
                "Content-Type":"application/json",
                "Access-Control-Allow-Origin": "*",
            },
        };
        return config;
    };

    function getAllPlayers(){
        axios.get("http://localhost:8080/players", getHeaders())
        .then(resp =>{
            return resp.data;
        })
        .catch((error) => {
            console.log("error - ", Object.assign({}, error));
        });
    }

    getAllPlayers();


    return(
        <div>
            <h2 className="m-3">Jogadores</h2>
            <AddPlayers/>
            <PlayersTable/>
        </div>
    )

}

export default AdminPlayersPage;