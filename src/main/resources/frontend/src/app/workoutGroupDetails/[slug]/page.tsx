"use client"

import { Center, Box, Card, Text } from "@chakra-ui/react";
import React, { useEffect, useState } from "react";
import { useParams } from "next/navigation";
import WorkoutList from "@/app/components/workoutList";

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
    }, [id]);

    if (!workoutData) return <Center>Loading...</Center>;

    return (
        <Box>
            <Center>
                <Text textStyle={"5xl"}> {workoutData.name}</Text>
            </Center>
            <WorkoutList workouts={workoutData.workouts}/>
        </Box>
    );
}
