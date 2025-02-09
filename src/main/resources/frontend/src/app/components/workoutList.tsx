import {
    Grid,
    Card,
    Text,
    Center,
    Button,
    Box,
} from '@chakra-ui/react';
import Link from 'next/link'

interface Props {
    workouts: Array<Workout>
}

export default function WorkoutList(props: Props) {

    return (
        <Box>
            <Grid templateColumns='repeat(4, 1fr)' gap={6} m={10}>
                {props.workouts.map((workout: Workout) => (
                    <Card.Root key={workout.id}>
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
                                <Link href={"/liftDetails/" + workout.id}>
                                    <Button>
                                        Lift Info
                                    </Button>
                                </Link>
                            </Center>
                            <Center>
                            <Text>
                                Sets:{workout.set}  Reps:{workout.rep}
                            </Text>
                            </Center>
                        </Card.Body>
                    </Card.Root>
                ))}
            </Grid>
        </Box>
    );
}