"use client"

import React, {useEffect, useState} from "react";
import {
    Grid,
    Card,
    Text,
    Center,
    Button,
    Box,
} from '@chakra-ui/react';
import Link from 'next/link'

export default function WorkoutGroupList() {

    const getAllWorkouts= async (pageNumber: Number, pageSize: Number, sort: String) => {
        const res = await fetch('http://localhost:1234/get-all-workout-groups?pageNumber=' + pageNumber + '&pageSize=' + pageSize);
        return res.json();
    }

    const [workoutData, setWorkoutData] = useState([]);
    const [pageNumber, setPageNumber] = useState(0);
    const [pageSize, setPageSize] = useState(12);

    useEffect(() => {
        getAllWorkouts(pageNumber, pageSize, "").then((data) => {
            setWorkoutData(data.content)
            setPageNumber(data.pageable.pageNumber)
            setPageSize(data.pageable.pageSize)
        });
    }, [pageNumber]);

    return (
        <Box>
            <Grid templateColumns='repeat(4, 1fr)' gap={6} m={10}>
                {workoutData.map((workout: WorkoutGroup) => (
                    <Card.Root  key={workout.id}>
                        <Card.Body>
                            <Center>
                                <Text>
                                    {workout.name}
                                </Text>
                            </Center>
                            {/*<Center mt={"2"}>*/}
                            {/*    <Image*/}
                            {/*        src={workout.thumbnailUrl}*/}
                            {/*        borderRadius='lg'*/}
                            {/*    />*/}
                            {/*</Center>*/}
                            <Center mt={"4"}>
                                <Link href={"/workoutGroupDetails/" + workout.id}>
                                    <Button>
                                        Info
                                    </Button>
                                </Link>
                            </Center>
                        </Card.Body>
                    </Card.Root>
                ))}
            </Grid>
        </Box>
    );
}