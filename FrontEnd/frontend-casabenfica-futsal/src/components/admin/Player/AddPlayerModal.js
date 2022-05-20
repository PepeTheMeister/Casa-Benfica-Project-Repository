import { Button, Modal } from "react-bootstrap";

import AddPlayerForm from "./AddPlayerForm";

function AddPlayerModal(props) {
  return (
    <Modal {...props}
    size="lg"
    aria-labelledby="contained-modal-title-vcenter"
    centered
    animation={true}
    onHide={props.onHide}>
    <Modal.Header closeButton className="text-light bg-danger">
      <Modal.Title className="">Adicionar Jogador</Modal.Title>
    </Modal.Header>
    <Modal.Body>
      <AddPlayerForm/>
    </Modal.Body>
    <Modal.Footer>
      <Button variant="secondary" onClick={props.onHide}>
        Cancelar
      </Button>
      <Button variant="primary" onClick={props.onHide}>
        Confirmar
      </Button>
    </Modal.Footer>
  </Modal>
  );
}

export default AddPlayerModal;
