"use client"

import { Center, Box, Card, Text } from "@chakra-ui/react";
import React, { useEffect, useState } from "react";
import { useParams } from "next/navigation";

interface Workout {
    id: string;
    name: string;
}

interface WorkoutGroup {
    id: string;
    name: string;
    workouts: Workout[];
}

export default function WorkoutGroupDetails() {
    const getWorkout = async (id: string) => {
        const res = await fetch('http://localhost:1234/get-workout-group-by-id?id=' + id);
        return res.json();
    }

    const params = useParams();
    const id = params.slug as string;

    const [workoutData, setWorkoutData] = useState<WorkoutGroup | null>(null);

    useEffect(() => {
            getWorkout(id).then((data) => {
                setWorkoutData(data);
            });
            console.log(workoutData);
    }, [id]);

    if (!workoutData) return <Center>Loading...</Center>;

    return (
        <Box>
            <Card.Root key={workoutData.id}>
                <Card.Body>
                    <Center>
                        <Text> {workoutData.name}</Text>
                    </Center>
                </Card.Body>
            </Card.Root>
        </Box>
    );
}
