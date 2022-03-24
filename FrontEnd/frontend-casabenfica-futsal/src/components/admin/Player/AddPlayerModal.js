import { Button, Modal } from "react-bootstrap";

function AddPlayerModal(props) {
  return (
    <Modal {...props}
    size
    aria-labelledby="contained-modal-title-vcenter"
    centered
    animation={true}
    onHide={props.closeModal}>
    <Modal.Header closeButton >
      <Modal.Title>Modal heading</Modal.Title>
    </Modal.Header>
    <Modal.Body>Woohoo, you're reading this text in a modal!</Modal.Body>
    <Modal.Footer>
      <Button variant="secondary" onClick={props.closeModal}>
        Close
      </Button>
      <Button variant="primary" onClick={props.closeModal}>
        Save Changes
      </Button>
    </Modal.Footer>
  </Modal>
  );
}

export default AddPlayerModal;
