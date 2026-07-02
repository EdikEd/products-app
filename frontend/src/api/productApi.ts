import type { Product } from "../models/Product";

const API_URL = "http://localhost:8080/api";

export async function getProducts(): Promise<Product[]> {
    const response = await fetch(`${API_URL}/products`);

    if (!response.ok) {
        throw new Error("Failed to fetch products");
    }

    return response.json();
}

export async function disableProduct(id: number): Promise<void> {
    const response = await fetch(`${API_URL}/products/${id}/disable`, {
        method: "POST",
    });

    if (!response.ok) {
        throw new Error("Failed to disable product");
    }
}