import { Container, Typography } from "@mui/material";
import ProductTable from "./components/ProductTable";

function App() {

    return (
        <Container maxWidth="md" sx={{ mt: 4 }}>

            <Typography variant="h4" gutterBottom>
                Customer Products
            </Typography>

            <ProductTable />

        </Container>
    );
}

export default App;