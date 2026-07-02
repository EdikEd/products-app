import { useEffect, useState } from "react";
import { getProducts } from "../api/productApi";
import type { Product } from "../models/Product";

import {
    Paper,
    Table,
    TableBody,
    TableCell,
    TableContainer,
    TableHead,
    TableRow,
    Typography
} from "@mui/material";

export default function ProductTable() {

    const [products, setProducts] = useState<Product[]>([]);

    useEffect(() => {
        loadProducts();
    }, []);

    async function loadProducts() {
        try {
            const data = await getProducts();
            setProducts(data);
        } catch (error) {
            console.error(error);
        }
    }

    return (
        <TableContainer component={Paper}>
            <Table>

                <TableHead>
                    <TableRow>
                        <TableCell>Product</TableCell>
                        <TableCell>Price</TableCell>
                        <TableCell>Status</TableCell>
                    </TableRow>
                </TableHead>

                <TableBody>

                    {products.map(product => (

                        <TableRow key={product.id}>

                            <TableCell>{product.name}</TableCell>

                            <TableCell>
                                € {product.price}
                            </TableCell>

                            <TableCell>
                                {product.status}
                            </TableCell>

                        </TableRow>

                    ))}

                </TableBody>

            </Table>
        </TableContainer>
    );
}