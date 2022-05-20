import AddPlayerModal from "./AddPlayerModal";


import {Button} from "react-bootstrap";
import { useState } from "react";



function AddPlayers(){
    const [modalIsOpen, setModalIsOpen] = useState(false);

    function closeModal(){
        setModalIsOpen(false);
    }

    function onButtonClick(){
        setModalIsOpen(true);
    }


    return(
        <div>
            <div className="d-grid gap-2 d-md-flex justify-content-md-end me-3">
                <Button variant="outline-danger" onClick={onButtonClick}>Adicionar jogador</Button>
            </div>
            <AddPlayerModal show={modalIsOpen} onHide={closeModal}/>
        </div>
        
        
    );
}


export default AddPlayers;